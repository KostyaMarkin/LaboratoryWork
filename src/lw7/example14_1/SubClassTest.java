package lw7.example14_1;

public class SubClassTest extends SuperClassTest {
    private String stroka2, stroka3;

    SubClassTest(String strokaExample){
        super(strokaExample);
    }

    SubClassTest(String strokaExample2, String strokaExample3){
        this.stroka2 = strokaExample2;
        this.stroka3 = strokaExample3;

    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "sub" + "\n" + "Class name: " + this.getClass().getSimpleName() + "\n" + " stroka = " + this.getStroka()  + " stroka 2 = " + this.stroka2  + " stroka 3 = " + this.stroka3;

        return superClassNameAndFieldValue;

    }
    public String getStroka3(){
        return stroka3;
    }
    public void setStroka3(String stroka){
        this.stroka3 = stroka;
    }
    public String getStroka2(){
        return stroka2;
    }
    public void setStroka2(String stroka){
        this.stroka2 = stroka;
    }
}
