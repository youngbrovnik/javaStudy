public class Member {
    public String mName;
    public String mId;
    public String mPassword;
    public  int mAge;

    void Member(String name, String id){
        mName = name;
        mId = id;
    }

    boolean login(String id, String password){
        if(id=="hong" & password=="12345")
            return true;

        return false;
    }

    void logout(String id){
        System.out.println("로그아웃 되었습니다.");
    }

}
