package Q5;

public class main {
    public static void main(String[] args) {
        MyProtectedUniqueList m1=new MyProtectedUniqueList("pass");
        m1.Add("pass",3);
        m1.Add("pass",2);
        m1.Add("pass",1);
        System.out.println(m1.toString());
        m1.Sort("pass");
        System.out.println(m1.toString());

        for (var str:m1) {
            System.out.println(str);
        }


    }
}
