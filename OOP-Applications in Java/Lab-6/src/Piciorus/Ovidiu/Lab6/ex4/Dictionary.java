package Piciorus.Ovidiu.Lab6.ex4;

import java.util.HashMap;
import java.util.Iterator;

public class Dictionary {
    private HashMap<Word, Definition> dictionary = new HashMap<>();

    public Dictionary() {
    }

    public Dictionary(HashMap<Word, Definition> dictionary) {
        this.dictionary = dictionary;
    }

    public void addWord(Word w, Definition d) {
        this.dictionary.put(w, d);
    }

    public Definition getDefinition(Word w) {
        return dictionary.get(w);
    }

    public void getAllWords() {
        Iterator iterator = dictionary.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void getAllDefinition() {
        Iterator iterator = dictionary.keySet().iterator();
        Iterator iterator2 = dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " : " + iterator2.next());
        }
    }
}