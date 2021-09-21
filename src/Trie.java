public class Trie {
    private Trie[] children;
    private  boolean end;
    /** Initialize your data structure here. */
    public Trie() {
        children =new Trie[26];
        end=false;

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node = this;
        int n=word.length();
        for(int i=0;i<n-1;i++){
            int n1=word.charAt(i)-'a';
            if(node.children[n1]==null){
                node.children[n1]=new Trie();

            }
            node= node.children[n1];

        }
        node.end=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = this;
        int n=word.length();
        for(int i=0;i<n-1;i++){
            int n1=word.charAt(i)-'a';
            if(node.children[n1]==null){
                return false;
            }
            node= node.children[n1];
        }

        return  node.end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = this;
        int n=prefix.length();
        for(int i=0;i<n-1;i++){
            int n1=prefix.charAt(i)-'a';
            if(node.children[n1]==null){
                return false;
            }
            node= node.children[n1];

        }
        return true;
    }
}

