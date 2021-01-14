package team.okky.personnel_management.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

public class EmployeeDTO {

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter @Setter
    public static class ListIndex {
        private Long empId;
        private String empName;
        private String departmentDeptName;
        private String empPosition;
        private LocalDate empJoinDate;
        private String empPhoneNum;
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter @Setter
    public static class ListIndexPage {
        List<ListIndex> list;
        PageResultDTO pageResultDTO;
    }

    @Builder
    @Getter @Setter
    public static class ListByStatus {
        private String empPosition;
        private String empName;
        private LocalDate empJoinDate;
        private String deptName;
    }

    @Builder
    @Getter @Setter
    public static class AddEmployee {
        private String empName;
        private Long deptId;
        private String empPosition;
        private LocalDate empJoinDate;
        private String empPhoneNum;
    }

    @Builder
    @Getter @Setter
    public static class UpdateEmployee {
        private Long empId;
        private String empPhoneNum;
        private LocalDate empJoinDate;
    }
}
