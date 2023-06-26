import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { ComponentsComponent } from './components/components.component';
//import { HeaderComponent } from './header/header.component';
//import { FooterComponent } from './footer/footer.component';
//import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    ComponentsComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

