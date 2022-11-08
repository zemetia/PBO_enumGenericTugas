public class EnumTest {
    enum UserType {
        ADMIN,
        MODERATOR,
        EDITOR,
        BUYER,
        SELLER
    }

    public static void main(String[] args) {
        UserType akun1 = UserType.ADMIN;
        UserType akun2 = UserType.MODERATOR;
        UserType akun3 = UserType.SELLER;

        System.out.print(akun1 + " " + akun2 + " " + akun3);

    }   
}