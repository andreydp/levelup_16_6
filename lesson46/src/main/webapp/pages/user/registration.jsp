<%--
  Created by IntelliJ IDEA.
  User: andrey
  Date: 25.05.17
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>UserTable</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>

<style type="text/css">
    #id-column {
        width: 25px
    }

    #login-column {
        width: 100px
    }

    #email-column {
        width: 100px
    }

    #age-column {
        width: 100px
    }

    #role-column {
        width: 100px
    }

    #gender-column {
        width: 100px
    }
</style>


<div id="edit-form" hidden>
    <table class="table">
        <tr style="vertical-align: top;">
            <td><input type="text" id="id" placeholder="Id" name="id"></td>
            <td><input type="text" id="login" placeholder="Login" name="login"></td>
            <td><input type="email" id="email" placeholder="Email" name="email"></td>
            <td><input type="text" id="age" placeholder="Age" name="age"></td>
            <td>
                <select id="role">
                    <option value="SIMPLE">Simple</option>
                    <option value="ADMIN">Administrator</option>
                </select>
            </td>
            <td>
                <div id="gender">
                    <input type="radio" name="gender" checked value="NOT_SPECIFIED">Not cpecified</option>
                    <p><input type="radio" name="gender" value="MALE">Male</p>
                    <p><input type="radio" name="gender" value="FEMALE">Female</p>
                </div>
        </tr>
        <span>
					<td><button hidden id="save-btn" onclick="saveUser(this)">Save</button></td>
				</span>

        <span>
					<td><button hidden id="send-btn" onclick="sendUser()">Send</button></td>
				</span>
    </table>
</div>

<div class="container">
    <table class="table table-hover table-bordered">
        <thead>
        <!-- <th scope="row"></th> -->
        <tr>
            <td id="id-column">#</td>
            <td id="login-column">Login</td>
            <td id="email-column">Email</td>
            <td id="age-column">Age</td>
            <td id="role-column">Role</td>
            <td id="gender-column">Gender</td>
        </tr>
        </thead>

        <tbody id="user-table">

        <tr>
            <td name="id">1</td>
            <td name="login">Alex</td>
            <td name="email">alex@yopmail.com</td>
            <td name="age">26</td>
            <td name="role">Administrator</td>
            <td name="gender">Male</td>

            <td>
                <button data-id="1" style="display: inline-block;" onclick="editUser(this)">Edit</button>
            </td>
        </tr>

        <tr>
            <td name="id">2</td>
            <td name="login">Tom</td>
            <td name="email">tom@yopmail.com</td>
            <td name="age">37</td>
            <td name="role">Simple</td>
            <td name="gender">Male</td>

            <td>
                <button data-id="1" style="display: inline-block;" onclick="editUser(this)">Edit</button>
            </td>
        </tr>
        </tbody>
    </table>
</div>

<button onclick="showAddForm()">Add user</button>


<script type="text/javascript">

    function showAddForm() {
        showEditForm();

        document.getElementById('send-btn').removeAttribute('hidden');
        document.getElementById('save-btn').setAttribute('hidden', true);

    }

    function sendUser() {
        let user = getFormData();
        let responseStatus = "";
        let requestParams = "login=  " + user.id + "&email=" + user.email;

        let headers = new Headers({
            'Content-Type': 'application/x-www-form-urlencoded'
            // 'Access-Control-Allow-Origin': '*'
        });

        fetch("/user/registration", {
            method: 'post',
            headers: {
                "Content-type": "application/x-www-form-urlencoded; charset=UTF-8"
            },
            body: requestParams
        })
            .then(function (response) {
                responseStatus = response.status;
                console.log(response.status);
                if (responseStatus == "200") {

                $('#user-table tr:last').after(
                    '<tr><td name="login">' + user.login +
                    '</td> <td>' +
                    '</td><td>' +
                    '</td><td>' +
                    '</td><td></td><td></td><td></td></tr>'
                );
            }
    }
    )
    .catch(alert);
    }

    function saveUser() {
        let currentRow = document.querySelector('tr[in-editing]');

        currentRow.removeAttribute('in-editing');


        let id = currentRow.querySelector('td[name="id"]');
        let login = currentRow.querySelector('td[name="login"]');
        let email = currentRow.querySelector('td[name="email"]');
        let age = currentRow.querySelector('td[name="age"]');
        let role = currentRow.querySelector('td[name="role"]');
        let gender = currentRow.querySelector('td[name="gender"]');


        let user = getFormData();

        id.innerHTML = user.id;
        login.innerHTML = user.login;
        email.innerHTML = user.email;
        age.innerHTML = user.age;
        role.innerHTML = user.role;
        gender.innerHTML = user.gender;
    }


    function editUser(data) {
        showEditForm();

        let currentRow = data.parentNode.parentNode;

        currentRow.setAttribute('in-editing', '');

        let id = currentRow.querySelector('td[name="id"]').innerHTML;
        let login = currentRow.querySelector('td[name="login"]').innerHTML;
        let email = currentRow.querySelector('td[name="email"]').innerHTML;
        let age = currentRow.querySelector('td[name="age"]').innerHTML;
        let role = currentRow.querySelector('td[name="role"]').innerHTML;
        let gender = currentRow.querySelector('td[name="gender"]').innerHTML;


        document.getElementById('id').value = id;
        document.getElementById('login').value = login;
        document.getElementById('email').value = email;
        document.getElementById('age').value = age;

        let roleSelect = document.getElementById('role').options;

        for (let i = roleSelect.length - 1; i >= 0; i--) {
            let opt = roleSelect[i];

            if (role === opt.innerHTML) {
                roleSelect[i].selected = true
            } else roleSelect[i].selected = false;
        }
    }

    function showEditForm() {
        document.getElementById('edit-form').removeAttribute('hidden');
    }


    function getFormData() {
        let id = document.getElementById('id').value;
        let login = document.getElementById('login').value;
        let email = document.getElementById('email').value;
        let age = document.getElementById('age').value;
        let roleSelect = document.getElementById('role');

        let role = roleSelect.options[roleSelect.selectedIndex].text;
        let gender = document.getElementById('gender').value;

        return {id, login, email, age, role, gender};
    }

    // function addUser() {
    // 	let id = document.getElementById("id").value;
    // 	let login = document.getElementById("login").value;
    // 	let email = document.getElementById("email").value;
    // 	let age = document.getElementById("age").value;
    // 	let role = document.getElementById("role").value;
    // 	let gender = document.querySelector('input[name="gender"]:checked').value;

    // 	let table = document.getElementById("user-table");

    // 	let row = table.insertRow();

    // 	row.insertCell(0).innerHTML = id;
    // 	row.insertCell(1).innerHTML = login;
    // 	row.insertCell(2).innerHTML = email;
    // 	row.insertCell(3).innerHTML = age;
    // 	row.insertCell(4).innerHTML = role;
    // 	row.insertCell(5).innerHTML = gender;

    // 	table.appendChild(row);

    // 	hideEditForm();
    // }

    // function saveUser(data) {
    // 	hideEditForm();
    // }

    // function editUser(data) {
    // 	showEditForm();

    // 	console.log(data.parentNode.parentNode.children[0].innerHTML);
    // 	console.log(data.parentNode.parentNode.children[1].innerHTML);
    // 	console.log(data.parentNode.parentNode.children[2].innerHTML);
    // 	console.log(data.parentNode.parentNode.children[3].innerHTML);
    // 	console.log(data.parentNode.parentNode.children[4].innerHTML);
    // 	console.log(data.parentNode.parentNode.children[5].innerHTML);
    // }

    // function showEditForm() {
    // 	document.getElementById('edit-form').removeAttribute('hidden');
    // }


    // function hideEditForm() {
    // 	document.getElementById('edit-form').setAttribute('hidden', 'true');
    // }
</script>

</body>
</html>
