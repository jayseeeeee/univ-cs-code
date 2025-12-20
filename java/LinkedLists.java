void main() {
    LinkedList<String> letters = new LinkedList<String>();
    LinkedList<Integer> numbers = new LinkedList<Integer>();

    // LinkedList as Stack
    letters.push("A");
    letters.push("B");
    letters.push("C");
    letters.push("D");
    letters.push("F");
    IO.println("Letters: " + letters);

    // Pop for Stack
    letters.pop();
    IO.println("Letters - Pop: " + letters);

    // LinkedList as Queue
    numbers.offer(1);
    numbers.offer(2);
    numbers.offer(3);
    numbers.offer(4);
    numbers.offer(5);
    IO.println("Numbers: " + numbers);

    // Poll for Queue
    numbers.poll();
    IO.println("Numbers - Poll: " + numbers);

    // Adding Element
    letters.add(4, "E");
    IO.println("Letters - Add E: " + letters);
    // Removing Element
    letters.remove("E");
    IO.println("Letters - Remove E: " + letters);

    // Return index/number position
    IO.println("Letters - Index of A: " + letters.indexOf("A"));

    // Return first and last value
    IO.println("Numbers - Peek First: " + numbers.peekFirst());
    IO.println("Numbers - Peek Last: " + numbers.peekLast());


    // Adding to first and last value in list
    numbers.addFirst(0);
    numbers.addLast(6);
    IO.println("Numbers - Added First & Last: " + numbers);

    // Remove first and last then store in variable
    Integer first = numbers.removeFirst();
    Integer last = numbers.removeLast();
    IO.println("Numbers - Removed First and Last: " + numbers);
    IO.println("Stored Numbers: " + first + ", " + last);
}
