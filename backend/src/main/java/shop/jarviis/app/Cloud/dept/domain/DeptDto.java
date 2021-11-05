package shop.jarviis.app.Cloud.dept.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter @Setter @ToString
public class DeptDto implements Serializable {

    private long depNo;
    private String dname;
    private String loc;
}
