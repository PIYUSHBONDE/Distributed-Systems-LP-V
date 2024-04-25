import ReverseModule.ReversePOA;

class ReverseImpl extends ReversePOA {
    ReverseImpl() {
        super();
        System.out.println("Reverse Object Created");
    }

    public String reverse_string(String name) {
        return "Server Send " + name.toUpperCase();
    }
}
