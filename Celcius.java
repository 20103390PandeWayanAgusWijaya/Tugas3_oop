/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.tugas3;


public class Celcius {
   double toFahrenheit(){
   //°F = °C × 1,8 + 32
   return (Tugas3.SuhuAwal*1.8+32);
   }
   double toReamur(){
   //°Ré = °C × 0,8
   return (Tugas3.SuhuAwal*0.8);
   }
   double toKelvin(){
   //K = °C + 273,15
   return (Tugas3.SuhuAwal+273.15);
   }
}
