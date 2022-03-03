public class Main {
    public static ClassName className;
    public static final String[] validName = new String[] {"C0318G"};
    public static final String[] inValidName = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validName
             ) {
            boolean isValid = className.validate(name);
            System.out.println("Name of class: " + name + " = " + isValid);
        }
        for (String name : inValidName
                ) {
            boolean isInvalid = className.validate(name);
            System.out.println("Name of class: " + name + " = " + isInvalid);
        }
    }
}
