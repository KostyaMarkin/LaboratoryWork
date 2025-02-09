package lw7.example14_1;

public class SuperClassTest {
    private String stroka;

    SuperClassTest(String strokaExample){
        this.stroka = strokaExample;
    }

    SuperClassTest(){
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" + "Class name: " + this.getClass().getSimpleName() + "\n" + " stroka = " + this.getStroka();

        return superClassNameAndFieldValue;

    }

    public String getStroka(){
        return stroka;
    }

    public void setStroka(String stroka){
        this.stroka = stroka;
    }
}

