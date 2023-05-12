import { ActivatedRoute, Router } from "@angular/router";
import { Employee } from "../employee";
import { EmployeeService } from "./../employee.service";
import { Component } from "@angular/core";

@Component({
  selector: "app-update-employee",
  templateUrl: "./update-employee.component.html",
  styleUrls: ["./update-employee.component.css"],
})
export class UpdateEmployeeComponent {
  id: number;

  employee: Employee = new Employee();

  constructor(private employeeService: EmployeeService, private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];

    this.employeeService.getEmployeedById(this.id).subscribe(
      (data) => {
        this.employee = data;
      },
      (error) => console.log(error)
    );
  }

  onSubmit() {
    this.employeeService.updateEmployee(this.id, this.employee).subscribe((data) => {});
  }
}
