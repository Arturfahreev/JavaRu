package com.javarush.task.pro.task13.task1314;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        String result = null;
        Node x = first.getNext();

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                result = x.getValue();
                return result;
            }
            if (x.getNext() != null) x = x.getNext();
            else break;

        }

        return result;
    }


    public static class Node {
        private Node prev;
        private String value = null;
        private Node next;

        public String getValue () {
            return value;
        }

        public Node getNext() {
            return next;
        }
        public Node getPrev() {
            return prev;
        }

    }
}
