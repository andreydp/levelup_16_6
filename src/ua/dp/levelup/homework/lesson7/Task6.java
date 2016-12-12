package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task6
{
//    6. Дан email в виде строки. Написать программу для проверки email на валидность. email должен соответствовать условию (пример - emailaddr@domain.zone)
//      1)	emailaddr > 4 символов
//      2)	1 < domain < 10
//       3)	2 <= zone < 5
//    При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.


    public static boolean checkEmail(String email)
    {
        String emailAddr = email.substring(0, email.indexOf("@"));
        String domain = email.substring(emailAddr.length() + 1).substring(0, email.substring(emailAddr.length() + 1).indexOf("."));
        String zone = email.substring(emailAddr.length() + domain.length() + 2);

        if (emailAddr.length() <= 4)
        {
            System.out.print("emailAddr is too short! ");
            System.out.println("emailAddr: '" + emailAddr + "' email: " + email);
            return false;
        }
        if (domain.length() <= 1 || domain.length() >= 10)
        {
            System.out.print("invalid domain! 1 < domain < 10 ");
            System.out.println("domain: '" + domain + "' email: " + email);
            return false;
        }
        if (zone.length() < 2 || zone.length() > 15)
        {
            System.out.print("invalid zone! 2 <= zone < 5 ");
            System.out.println("zone: '" + zone + "' email: " + email);
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
//        System.out.println(checkEmail("andp@ua.fm"));
//        System.out.println(checkEmail("poletaiev@gmail.com"));
        String email = "poletaiev@gmail.com";
        System.out.println(checkEmail(email));
    }
}
