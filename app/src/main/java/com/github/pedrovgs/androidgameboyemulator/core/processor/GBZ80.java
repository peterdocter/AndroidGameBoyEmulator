/*
 * Copyright (C) 2015 Pedro Vicente Gomez Sanchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.androidgameboyemulator.core.processor;

public class GBZ80 {
  private static final int MASK_16_BITS = 65535;

  private final Clock clock;

  private int programCounter;
  private int stackPointer;

  private int registerA;
  private int registerB;
  private int registerC;
  private int registerE;
  private int registerH;
  private int registerL;
  private int registerF;

  private int lastInstructionClockM;
  private int lastInstructionClockT;

  public GBZ80() {
    this.clock = new Clock();
  }

  public void execute(int instruction) {

  }

  public void updateProgramCounter() {
    this.programCounter &= MASK_16_BITS;
  }

  public void updateClock() {
    clock.incrementClockM(lastInstructionClockM, lastInstructionClockT);
  }

  public int getProgramCounter() {
    return programCounter;
  }

  public int getRegisterA() {
    return registerA;
  }

  public void setRegisterA(int registerA) {
    this.registerA = registerA;
  }

  public int getRegisterB() {
    return registerB;
  }

  public void setRegisterB(int registerB) {
    this.registerB = registerB;
  }

  public int getRegisterC() {
    return registerC;
  }

  public void setRegisterC(int registerC) {
    this.registerC = registerC;
  }

  public int getRegisterE() {
    return registerE;
  }

  public void setRegisterE(int registerE) {
    this.registerE = registerE;
  }

  public int getRegisterH() {
    return registerH;
  }

  public void setRegisterH(int registerH) {
    this.registerH = registerH;
  }

  public int getRegisterL() {
    return registerL;
  }

  public void setRegisterL(int registerL) {
    this.registerL = registerL;
  }

  public int getRegisterF() {
    return registerF;
  }

  public void setRegisterF(int registerF) {
    this.registerF = registerF;
  }

  public void setLastInstructionClockM(int lastInstructionClockM) {
    this.lastInstructionClockM = lastInstructionClockM;
  }

  public void setLastInstructionClockT(int lastInstructionClockT) {
    this.lastInstructionClockT = lastInstructionClockT;
  }
}