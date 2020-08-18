package AlexLee_youtube;

import java.util.Stack;

public class Stacks_examples {
    public static void main(String[] args) {

        Stack <String> games = new Stack<String>();

        // part 1 - POP
        games.add("Call of Duty");
        games.add("Guitar hero");
        games.add("Super Monkey Ball");

        System.out.println(games); // [Call of Duty, Guitar hero, Super Monkey Ball]
        System.out.println(games.pop()); // Super Monkey Ball --> it's like we took the latest item and put it away
        System.out.println(games); // [Call of Duty, Guitar hero]
        System.out.println(games.pop()); // Guitar hero
        System.out.println(games); // [Call of Duty]
        System.out.println(games.pop()); // Call of Duty
        System.out.println(games); // []

        // Part 2 - PEEK
        games.add("One");
        games.add("Two");
        games.add("Three");
        System.out.println(games.peek()); // Three --> it prints the most recent, BUT still has it listed in stack
        System.out.println(games); // [One, Two, Three]

        // Part 3
            // Y
            // B
            // R
        Stack<Character> tower = new Stack<Character>();
        tower.add('R');
        tower.add('B');
        tower.add('Y');
        System.out.println(tower.peek()); // Y
        System.out.println(tower.contains('S')); // false
        System.out.println(tower.empty()); // false --> it's not empty
        System.out.println(tower.get(1)); // getting by index
        System.out.println(tower.get(0)); // R
        // replacing character at specific index:
        tower.set(1, 'P');
        System.out.println(tower); // [R, P, Y]
        System.out.println(tower.size()); // 3
        System.out.println(tower.search('Y')); // returns 1 --> present
        System.out.println(tower.search('Z')); // return -1 --> NOT present


    }
}
