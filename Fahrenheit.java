/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.tugas3;

public class Fahrenheit {
  double toReamur(){
  //°Ré = (°F − 32) / 2,25
  return ((Tugas3.SuhuAwal-32)/2.25);
  }
  double toKelvin(){
  //K = (°F + 459,67) / 1,8
  return ((Tugas3.SuhuAwal+459.67)/ 1.8);
  }
  double toCelcius(){
  //°C = (°F − 32) / 1,8
  return ((Tugas3.SuhuAwal-32)/1.8);
  }
}
