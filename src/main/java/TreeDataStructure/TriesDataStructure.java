package TreeDataStructure;


// Example for String or words
class Node {

    private Node[] pointers = new Node[26];
    private boolean isCompleted = false;

    public void put(char c, Node node) {
        pointers[c - 'a'] = node;
    }

    public int getLength() {
        return pointers.length;
    }
    public Node[] getPointers() {
        return pointers;
    }

    public boolean containsKey(char c) {
        return pointers[c - 'a'] != null;
    }

    public Node get(char c) {

        return pointers[c - 'a'];
    }
    public Node get(int index) {
        return pointers[index];
    }

    public void setEnd() {
        isCompleted = true;
    }

    public boolean isEnd() {
        return isCompleted;
    }


}


class Trie {
    private static Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        word = word.toLowerCase();
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.get(word.charAt(i));
        }

        node.setEnd();
    }

    public boolean search(String word) {
        Node node = root;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (node.containsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));
            }
            if (node.isEnd()) {
                return true;
            }

        }
        return false;
    }

    private void traversing(Node node, StringBuilder prefix) {
        for (int i = 0; i < node.getLength(); i++) {
            if (node.get(i) != null) {
                // Append the current character to the prefix
                prefix.append((char) (i + 'a'));

                if (node.get(i).isEnd()) {
                    // Print the accumulated prefix when a word is completed
                    System.out.println(prefix);
                }

                // Continue traversal for the current child
                traversing(node.get(i), prefix);

                // Backtrack by removing the last character
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }

    }

    public void traverse() {
        Node node = root;
//        for(int i=0;i<node.getLength();i++){
//            if(node.get(i) != null)
//                System.out.println("dasdsdasds");
//        }


         traversing(node, new StringBuilder());
//        for (int i = 0; i < node.getLength(); i++) {
//            StringBuilder stringBuilder = new StringBuilder();
//            if(node.get(i) == null){
//                return;
//            }
//             if(!node.isEnd()){
//                 stringBuilder.append((i+'a'));
//            }else {
//                 System.out.println(stringBuilder);
//                 stringBuilder.delete(0,stringBuilder.length());
//             }
//            node = node.get()
//        }

    }


}

public class TriesDataStructure {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Hello");
        trie.insert("yellow");
//       System.out.printf(String.valueOf(trie.search("hello")));
//       trie.traverse();
        float s = (float) 5 /2;
        System.out.println(s);
    }
}
