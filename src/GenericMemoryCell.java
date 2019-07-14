public class GenericMemoryCell<AnyType> {
    private AnyType storedValue;

    public void write(AnyType x){
        storedValue = x;
    }

    public AnyType read(){
        return storedValue;
    }
}
