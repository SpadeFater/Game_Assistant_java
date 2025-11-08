package dontstave.food;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class DontStarveFoodHandler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    // 构造函数、getter和setter方法
    public DontStarveFoodHandler() {}

    public DontStarveFoodHandler(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getter和setter方法...
}
