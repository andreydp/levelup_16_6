package ua.dp.levelup.homework.lesson20

import spock.lang.Specification

/**
 * Created by java on 24.01.2017.
 */
class SingleLinkedListTest extends Specification {
    def "add first node"() {
        ua.dp.levelup.homework.lesson20.SingleLinkedList list = new ua.dp.levelup.homework.lesson20.SingleLinkedList();

        when: "add node element"
        list.addFirst(new ua.dp.levelup.homework.lesson20.Node(1))

        then: "check size"
        list.size() == 1
        list.getFirst().isPresent()
        list.getFirst().get().value == 1
    }

    def "add first node to list with one element"() {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(new Node(5));

        when: "add one more element"
        list.addFirst(new ua.dp.levelup.homework.lesson20.Node(5))

        then: "check size"
        list.size() == 2
        list.getFirst().isPresent()
        list.getFirst().get().value == 5
    }

    def "add null node to empty list"() {
        ua.dp.levelup.homework.lesson20.SingleLinkedList list = new ua.dp.levelup.homework.lesson20.SingleLinkedList();

        when: "add node element"
        list.addFirst(null)

        then: "check size"
        list.size() == 0
    }
}
