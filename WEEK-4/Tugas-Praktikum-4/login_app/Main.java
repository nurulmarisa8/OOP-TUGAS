package login_app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        int selectMenu = 0;
        try {
            selectMenu = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            sc.nextLine();
            runApp();
            return;
        }

        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            default:
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.nextLine();

        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();

            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            if (isPasswordMatch) {
                System.out.println("Berhasil Login!");
                showDetailUser(listUserProfile.get(userIndex));

                System.out.println("1. Logout");
                System.out.println("2. Keluar");
                System.out.print("> ");
                int pilih = sc.nextInt();
                sc.nextLine();
                if (pilih == 1) {
                    runApp();
                } else {
                    System.out.println("Sampai jumpa!");
                    System.exit(0);
                }
            } else {
                System.out.println("Password Salah");
                runApp();
            }
        } else {
            System.out.println("Username tidak ditemukan!");
            runApp();
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();

        for (User u : listUser) {
            if (u.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan!");
                runApp();
                return;
            }
        }

        if (username.trim().isEmpty()) {
            System.out.println("Username tidak boleh kosong!");
            runApp();
            return;
        }

        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        if (password.trim().isEmpty()) {
            System.out.println("Password tidak boleh kosong!");
            runApp();
            return;
        }

        User user = new User(username, password);
        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();

        int age = 0;
        while (true) {
            try {
                System.out.println("Umur");
                System.out.print("> ");
                age = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Umur harus angka!");
                sc.nextLine();
            }
        }

        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.nicknameGenerator(fullName));

        listUser.add(user);
        listUserProfile.add(profile);

        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        showDetailUser(profile);

        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("Profil Pengguna");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap : " + profile.getFullName());
        System.out.println("Nickname     : " + profile.getNickName());
        System.out.println("Umur         : " + profile.getAge());
        System.out.println("Hobby        : " + profile.getHobby());
    }
}
