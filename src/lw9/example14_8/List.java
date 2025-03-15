package lw9.example14_8;

public class List {
    private ElementList head;
    private ElementList tail;


    public void createTail(String... str) {
        for (String stroka : str) {
            ElementList element = new ElementList();
            element.value = stroka;
            if (head == null) {
                head = element;
                tail = element;
            } else {
                element.next = element;
                head= element;
            }
        }
    }

    public void createTailRec(String... str) {
        createTailRec(0,str);
    }

    public void createTailRec(int i,String... str) {
        if(i >= str.length) {
            return;
        }else {
            String stroka = str[i];
            ElementList element = new ElementList();
            element.value = stroka;
            if (head == null) {
                head = element;
                tail = element;
            } else {
                element.next = element;
                head = element;
            }
        }
        i++;
        createTailRec(i,str);
    }

    public void createHead(String... str) {
        for (String stroka : str) {
            ElementList element = new ElementList();
            element.value = stroka;
            if (tail == null) {
                head = element;
                tail = element;
            } else {
                tail.next = element;
                tail = element;
            }

        }
    }

    public void createHeadRec(String... str) {
        createHeadRec(0,str);
    }

    public void createHeadRec(int i,String... str) {
        if(i >= str.length) {
            return;
        }else {
            String stroka = str[i];
            ElementList element = new ElementList();
            element.value = stroka;
            if (tail == null) {
                head = element;
                tail = element;
            } else {
                tail.next = element;
                tail = element;
            }
        }
        i++;
        createHeadRec(i,str);
    }

    public String toString(){
        String result = "";
        ElementList ref = head;
        while(ref != null){
            result = result + ref.value + ", ";
            ref = ref.next;
        }
        return result;
    }
    public String toStringRec(){
        String result = "";
        ElementList ref = head;
        while(ref != null){
            result = result + ref.value + ", ";
            ref = ref.next;
        }
        return result;
    }

    public String toStringRec(ElementList ref, String result){
        if(ref != null){
            return result;
        }else{
            result = result + ref.value + ", ";
            ref = ref.next;
            return result = toStringRec(ref,result);
        }


    }

    public void AddFirst(String stroka){
        ElementList newElement = new ElementList();
        newElement.value = stroka;
        ElementList element = head;
        head = newElement;
        head.next = element;
    }

    public void AddLast(String stroka){
        ElementList newElement = new ElementList();
        newElement.value = stroka;
        tail.next = newElement;
        tail= newElement;
    }

    public void RemoveFirst(){
        ElementList newHead = head.next;
        head.next = null;
        head = newHead;
    }

    public void RemoveLast(){
        ElementList ref = head;
        ElementList newTail = new ElementList();
        while(ref != tail){
            newTail = ref.next;
        }
        tail = newTail;
    }

    public void RemoveIndexOf(int index){
        ElementList ref = head;
        ElementList refElementBeforeRemove = new ElementList();
        for(int i = 1; i < index; i++){
            refElementBeforeRemove = ref;
            ref= ref.next;
        }
        refElementBeforeRemove.next = refElementBeforeRemove.next.next;
    }
}
