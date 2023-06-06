package cn.codeyang.vertex.user.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yangzy
 */
@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
}
