import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { HttpClientModule } from "@angular/common/http";
import { AppComponent } from "./app.component";
import { EmployeeListComponent } from "./employee-list/employee-list.component";
import { AppRoutingModule } from "./app-routing.module";
import { CreateEmployeeComponent } from './create-employee/create-employee.component';

@NgModule({
  declarations: [AppComponent, EmployeeListComponent, CreateEmployeeComponent],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
