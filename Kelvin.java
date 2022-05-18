/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.tugas3;

public class Kelvin {
  double toFahrenheit(){
  //°F = K × 1,8 − 459,67
  return (Tugas3.SuhuAwal*1.8-459.67);
  }
  double toReamur(){
  //°Ré = (K − 273,15) × 0,8
  return ((Tugas3.SuhuAwal-273.15)*0.8);
  }
  double toCelcius(){
  //°C = K − 273,15
  return (Tugas3.SuhuAwal-273.15);
  }
}
