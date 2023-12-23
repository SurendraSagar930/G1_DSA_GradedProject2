import com.gl.AdminDepartment;
import com.gl.HrDepartment;
import com.gl.SuperDepartment;
import com.gl.TechDepartment;

public class Main {
    public static void main(String[] args) {

        SuperDepartment adminDepartment = new AdminDepartment();
        System.out.println(adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());

        System.out.println("");

        SuperDepartment hrDepartment = new HrDepartment();
        System.out.println(hrDepartment.departmentName());
        System.out.println(((HrDepartment)hrDepartment).doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.getTodaysWork());

        System.out.println("");
        SuperDepartment techDepartment = new TechDepartment();
        System.out.println(techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(((TechDepartment)techDepartment).getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());



    }
}