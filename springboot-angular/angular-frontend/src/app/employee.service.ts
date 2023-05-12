import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Employee } from "./employee";

@Injectable({
  providedIn: "root",
})
export class EmployeeService {
  private baseURL = "http://localhost:8081/api/employees";

  constructor(private httpClient: HttpClient) {} // inject http to employee services

  getEmployeeList(): Observable<Employee[]> {
    // create method
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee: Employee): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, employee);
  }

  getEmployeedById(id: number): Observable<Employee> {
    return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
  }
}
