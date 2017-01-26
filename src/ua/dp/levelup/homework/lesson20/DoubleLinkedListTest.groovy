package ua.dp.levelup.homework.lesson20

import spock.lang.Specification

/**
 * Created by java on 24.01.2017.
 */
class DoubleLinkedListTest extends Specification {
    def "add first node"() {
        DoubleLinkedList list = new DoubleLinkedList();

        when: "add node element"
        list.addFirst(new DualLinkedNode(1))

        then: "check size"
        list.size() == 1
        list.getFirst().value == 1
    }

    def "add first node to list with one element"() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(new DualLinkedNode(5));

        when: "add one more element"
        list.addFirst(new DualLinkedNode(5))

        then: "check size"
        list.size() == 2
        list.getFirst().value == 5
    }

    def "add last node"() {
        DoubleLinkedList list = new DoubleLinkedList();

        when: "add node element"
        list.addLast(new DualLinkedNode(1))

        then: "check size"
        list.size() == 1
        list.getLast().value == 1
    }

    def "add last node to list with one element"() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(new DualLinkedNode(5));

        when: "add one more element"
        list.addFirst(new DualLinkedNode(5))

        then: "check size"
        list.size() == 2
        list.getLast().value == 5
    }

    def "add null node to empty list"() {
        DoubleLinkedList list = new DoubleLinkedList();

        when: "add node element"
        list.addFirst(null)

        then: "check size"
        list.size() == 0
    }

    def "add null node to a list with one element"() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(new DualLinkedNode(5));
        when: "add first node element"
        list.addFirst(null)

        then: "check size"
        list.size() == 1
    }

    def "remove first on an empty list"() {
        DoubleLinkedList list = new DoubleLinkedList();
        when: "remove first"
        list.removeFirst()

        then: "check size"
        list.size() == 0
    }

    def "remove first on a list with one element"() {
        DoubleLinkedList list = new DoubleLinkedList();
        when: "add node element"
        list.addFirst(new DualLinkedNode(5));
        list.removeFirst()

        then: "check size"
        list.size() == 0
    }

    def "remove first on a list with two elements"() {
        DoubleLinkedList list = new DoubleLinkedList();
        when: "add node element"
        list.addFirst(new DualLinkedNode(5));
        list.addFirst(new DualLinkedNode(7));
        list.removeFirst()

        then: "check size and first element value"
        list.size() == 1
        list.getFirst().getValue() == 5;
    }
    def "remove last on an empty list"() {
        DoubleLinkedList list = new DoubleLinkedList();
        when: "remove last"
        list.removeLast()

        then: "check size"
        list.size() == 0
    }

    def "remove last on a list with one element"() {
        DoubleLinkedList list = new DoubleLinkedList();
        when: "add node element"
        list.addFirst(new DualLinkedNode(5));
        list.removeLast()

        then: "check size"
        list.size() == 0
    }

    def "remove last on a list with two elements"() {
        DoubleLinkedList list = new DoubleLinkedList();
        when: "add node element"
        list.addFirst(new DualLinkedNode(5));
        list.addFirst(new DualLinkedNode(7));
        list.removeLast()

        then: "check size and first element value"
        list.size() == 1
        list.getFirst().getValue() == 7;
    }

    def "get invalid index"()
    {
        DoubleLinkedList list = new DoubleLinkedList();
        when:
        list.get(0);
        then:
        thrown InvalidListIndexException;
    }

    def "add three elements and get second by index"()
    {
        DoubleLinkedList list = new DoubleLinkedList();

        when:
        list.addLast(new DualLinkedNode(1));
        list.addLast(new DualLinkedNode(2));
        list.addLast(new DualLinkedNode(3));

        then:
        list.get(1).value == 2;
    }

    def "add new element to 0 index to an empty list"()
    {
        DoubleLinkedList list = new DoubleLinkedList();

        when:
        list.addNode(new DualLinkedNode(1),0);

        then:
        list.size == 1
        list.getFirst().value == 1
    }

    def "add new element by index to a list with one element"()
    {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(new DualLinkedNode(1));

        when:
        list.addNode(new DualLinkedNode(2),1)

        then:
        list.size() == 2
        list.get(1).value == 2
    }


    def "remove an element on 0 index to an empty list"()
    {
        DoubleLinkedList list = new DoubleLinkedList();

        when:
        list.remove(0);

        then:
        thrown InvalidListIndexException
    }

    def "remove an element by 0 index from list with one element"()
    {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addNode(new DualLinkedNode(1),0)

        when:
        list.remove(0)

        then:
        list.size() == 0
    }


    def "remove an element by 1 index from list with three elements"()
    {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addNode(new DualLinkedNode(1),0)
        list.addNode(new DualLinkedNode(2),0)
        list.addNode(new DualLinkedNode(3),0)

        when:
        list.remove(1)

        then:
        list.size() == 2
    }


}
