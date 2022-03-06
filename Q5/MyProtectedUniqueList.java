package Q5;

import java.util.*;

public class MyProtectedUniqueList<T> implements Iterable<T>{
    private String pass;
    private List<T> words = new ArrayList<>();
    private int count=0;

    public MyProtectedUniqueList(String pass) {
        this.pass = pass;
    }

    public void Add(String pass, T word) {
        if (check(pass)) {
            if (!checkIfNull(word)) {
                words.add(word);
                count++;
            }
        }
    }

    public void Remove(String pass, T word) {
        if (check(pass)) {
            if (!checkIfNull(word)) {
                words.remove(word);
                count--;
            }
        }
    }

    public void RemoveAt(String pass,int i) {
        if (check(pass)) {
            if (i >= 0) {
                words.remove(i);
                count--;
            } else {
                throw new ArrayIndexOutOfBoundsException("index is less than 0");
            }
        }
    }

    public void Clear(String pass) {
        if (check(pass)) {
            words = new ArrayList<>();
            count=0;
        }
    }

    public void Sort(String pass) {
        if (check(pass)) {
//            Collections.sort(words);
        }
    }

    public boolean check(String word) {
        if (word.equals(pass)) {
            return true;
        } else throw new RuntimeException("Wrong pass ");
    }

    public boolean checkIfNull(T word) {
        if (word.equals("") || word.equals(null))
            throw new NullPointerException("null or empty value");
        else return false;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int innerCount=0;
            @Override
            public boolean hasNext() {
                return innerCount<count;
            }

            @Override
            public T next() {
                return words.get(innerCount++);
            }
        };
    }

    @Override
    public String toString() {
        return "MyProtectedUniqueList{" +
                "pass='" + pass + '\'' +
                ", words=" + words +
                ", count=" + count +
                '}';
    }

}
