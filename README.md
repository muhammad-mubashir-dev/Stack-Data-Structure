# Stack Data Structure in Java

A comprehensive Java repository demonstrating the **Stack** data structure (LIFO — Last-In, First-Out). This project includes three distinct internal implementations, custom exception handling, and classic algorithmic problems solved using stacks.

---

## Table of Contents
- [Overview](#overview)
- [Features & Structure](#features--structure)
  - [1. Stack Implementations](#1-stack-implementations)
  - [2. Custom Exceptions](#2-custom-exceptions)
  - [3. Algorithmic Problems](#3-algorithmic-problems)
- [Time & Space Complexity](#time--space-complexity)
- [Getting Started](#getting-started)
- [Usage Example](#usage-example)

---

## Overview

A **Stack** is a linear data structure that follows the **Last-In, First-Out (LIFO)** principle. Elements are added and removed from the same end, commonly referred to as the **top** of the stack.

Core operations supported across the implementations:
- `push(data)` — Inserts an element onto the top of the stack.
- `pop()` — Removes and returns the top element of the stack.
- `peek()` — Returns the top element without removing it.
- `isEmpty()` — Checks whether the stack contains any elements.

---

## Features & Structure

### 1. Stack Implementations
This repository explores three different ways to build and use a stack in Java:

* **Static Array Implementation**
  * Built from scratch using a fixed-size primitive/generic array.
  * Tracks the top element using an index pointer (`top`).
  * Demonstrates fixed-capacity memory management and boundary checks.

* **Linked List Implementation**
  * Built from scratch using dynamic `Node` objects.
  * Inserts and removes elements at the `head` of the list in $O(1)$ time without a fixed size limit.

* **Java Collections Framework Implementation**
  * Utilizes built-in Java utilities (`java.util.Stack` / `java.util.ArrayDeque`) to demonstrate standard production usage.

---

### 2. Custom Exceptions
To enforce safe stack boundaries and clear error reporting, two custom exceptions are implemented:

* **`StackOverflowException`** — Thrown when attempting to `push()` an element onto a full stack (applicable to the fixed-size static array implementation).
* **`StackUnderflowException`** — Thrown when attempting to `pop()` or `peek()` from an empty stack.

---

### 3. Algorithmic Problems
Includes recursive and stack-based solutions to two foundational stack interview questions:

1. **Push at the Bottom of a Stack**
   * Inserts a given element at the very bottom of an existing stack while preserving the relative order of all other elements using recursion ($O(n)$ time, $O(n)$ recursive call stack).
2. **Reverse a Stack**
   * Reverses the order of elements inside a stack in-place (without using an auxiliary data structure) by combining recursion with the *Push at the Bottom* helper function ($O(n^2)$ time).

---

## Time & Space Complexity

| Operation / Problem | Static Array | Linked List | Collections Framework |
| :--- | :---: | :---: | :---: |
| **`push()`** | $O(1)$ | $O(1)$ | $O(1)$ *(amortized)* |
| **`pop()`** | $O(1)$ | $O(1)$ | $O(1)$ |
| **`peek()`** | $O(1)$ | $O(1)$ | $O(1)$ |
| **`isEmpty()`** | $O(1)$ | $O(1)$ | $O(1)$ |
| **Push at Bottom** | $O(n)$ | $O(n)$ | $O(n)$ |
| **Reverse Stack** | $O(n^2)$ | $O(n^2)$ | $O(n^2)$ |
| **Space Complexity** | $O(N)$ *(fixed)* | $O(n)$ *(dynamic)* | $O(n)$ *(dynamic)* |

---

## Getting Started

### Prerequisites
* **Java Development Kit (JDK)** 8 or higher installed on your machine.
