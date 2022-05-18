/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.tugas3;

public class Reamur {
  double toFahrenheit(){
  //°F = °Ré × 2,25 + 32
  return (Tugas3.SuhuAwal*2.25+32);
  }
  double toKelvin(){
  //K = °Ré / 0,8 + 273,15
  return (Tugas3.SuhuAwal/0.8+237.15);
  }
  double toCelcius(){
  //°C = °Ré / 0,8
  return (Tugas3.SuhuAwal/0.8);
  }
}
