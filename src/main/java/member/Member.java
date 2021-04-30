package member;

public class Member {
    private Long idx;
    private String name;
    private String pw;

    public Member(Long idx, String name, String pw){
        this.idx = idx;
        this.name = name;
        this.pw = pw;
    }

    public Long getId() {
        return idx;
    }

    public void setId(Long idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    @Override
    public String toString() {
        return "Member{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
