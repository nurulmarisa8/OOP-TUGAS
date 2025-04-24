package login_app.utils;

public class StringUtils { 
    /*
     
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String nicknameGenerator(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            return "User";
        }
        String[] parts = fullName.split(" ");
        return parts[1]; // ambil nama belakang
    }

}
