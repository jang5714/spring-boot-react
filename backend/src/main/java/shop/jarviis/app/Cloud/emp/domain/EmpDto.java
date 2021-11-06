package shop.jarviis.app.Cloud.emp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter @Setter @ToString
public class EmpDto implements Serializable {
    private  long deptNo;
    private  int empCounntf;
    private  int salSum;
}
