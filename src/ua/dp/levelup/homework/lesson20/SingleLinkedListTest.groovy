package ua.dp.levelup.homework.lesson20

import spock.lang.Specification

/**
 * Created by java on 24.01.2017.
 */
class SingleLinkedListTest extends Specification {
    def "add first node"() {
        SingleLinkedList list = new SingleLinkedList();

        when: "add node element"
        list.addFirst(new Node(1))

        then: "check size"
        list.size() == 1
        list.getFirst().value == 1
    }

    def "add first node to list with one element"() {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(new Node(5));

        when: "add one more element"
        list.addFirst(new Node(5))

        then: "check size"
        list.size() == 2
        list.getFirst().value == 5
    }

    def "add last node"() {
        SingleLinkedList list = new SingleLinkedList();

        when: "add node element"
        list.addLast(new Node(1))

        then: "check size"
        list.size() == 1
        list.getLast().value == 1
    }

    def "add last node to list with one element"() {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(new Node(5));

        when: "add one more element"
        list.addFirst(new Node(5))

        then: "check size"
        list.size() == 2
        list.getLast().value == 5
    }

    def "add null node to empty list"() {
        SingleLinkedList list = new SingleLinkedList();

        when: "add node element"
        list.addFirst(null)

        then: "check size"
        list.size() == 0
    }

    def "add null node to a list with one element"() {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(new Node(5));
        when: "add first node element"
        list.addFirst(null)

        then: "check size"
        list.size() == 1
    }

    def "remove first on an empty list"() {
        SingleLinkedList list = new SingleLinkedList();
        when: "remove first"
        list.removeFirst()

        then: "check size"
        list.size() == 0
    }

    def "remove first on a list with one element"() {
        SingleLinkedList list = new SingleLinkedList();
        when: "add node element"
        list.addFirst(new Node(5));
        list.removeFirst()

        then: "check size"
        list.size() == 0
    }

    def "remove first on a list with two elements"() {
        SingleLinkedList list = new SingleLinkedList();
        when: "add node element"
        list.addFirst(new Node(5));
        list.addFirst(new Node(7));
        list.removeFirst()

        then: "check size and first element value"
        list.size() == 1
        list.getFirst().getValue() == 5;
    }
    def "remove last on an empty list"() {
        SingleLinkedList list = new SingleLinkedList();
        when: "remove last"
        list.removeLast()

        then: "check size"
        list.size() == 0
    }

    def "remove last on a list with one element"() {
        SingleLinkedList list = new SingleLinkedList();
        when: "add node element"
        list.addFirst(new Node(5));
        list.removeLast()

        then: "check size"
        list.size() == 0
    }

    def "remove last on a list with two elements"() {
        SingleLinkedList list = new SingleLinkedList();
        when: "add node element"
        list.addFirst(new Node(5));
        list.addFirst(new Node(7));
        list.removeLast()

        then: "check size and first element value"
        list.size() == 1
        list.getFirst().getValue() == 7;
    }

    def "get invalid index"()
    {
        SingleLinkedList list = new SingleLinkedList();
        when:
        list.get(0);
        then:
        thrown InvalidListIndexException;
    }

    def "add three elements and get second by index"()
    {
        SingleLinkedList list = new SingleLinkedList();

        when:
        list.addLast(new Node(1));
        list.addLast(new Node(2));
        list.addLast(new Node(3));

        then:
        list.get(1).value == 2;
    }

    def "add new element to 0 index to an empty list"()
    {
        SingleLinkedList list = new SingleLinkedList();

        when:
        list.addNode(new Node(1),0);

        then:
        list.size == 1
        list.getFirst().value == 1
    }

    def "add new element by index to a list with one element"()
    {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(new Node(1));

        when:
        list.addNode(new Node(2),1)

        then:
        list.size() == 2
        list.get(1).value == 2
    }


    def "remove an element on 0 index to an empty list"()
    {
        SingleLinkedList list = new SingleLinkedList();

        when:
        list.remove(0);

        then:
        thrown InvalidListIndexException
    }

    def "remove an element by 0 index from list with one element"()
    {
        SingleLinkedList list = new SingleLinkedList();
        list.addNode(new Node(1),0)

        when:
        list.remove(0)

        then:
        list.size() == 0
    }


    def "remove an element by 1 index from list with three elements"()
    {
        SingleLinkedList list = new SingleLinkedList();
        list.addNode(new Node(1),0)
        list.addNode(new Node(2),0)
        list.addNode(new Node(3),0)

        when:
        list.remove(1)

        then:
        list.size() == 2
    }


}