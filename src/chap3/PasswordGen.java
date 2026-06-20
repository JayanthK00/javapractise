public class PasswordGen {
    public static void main(String[] args) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 8;

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * chars.length());
            password += chars.charAt(index);
        }

        System.out.println(password);
    }
}

