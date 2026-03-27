# Week 3 & 4: Sorting and Searching Applications  
**Core Java | Data Structures | Problem-Based Learning**

## Overview
This module focuses on applying fundamental sorting and searching algorithms to real-world financial and system design scenarios. Each problem simulates practical use cases such as transaction auditing, risk analysis, trade processing, and data lookup.

The goal is to move beyond theory and understand how algorithms are used in production systems with constraints like performance, stability, and scalability.

---

## Learning Objectives

By completing these problems, you will:

- Understand when to use different sorting algorithms
- Learn trade-offs between time and space complexity
- Apply searching techniques efficiently on large datasets
- Implement stable and unstable sorting methods
- Analyze real-world constraints like duplicates and performance

---

## Topics Covered

### Sorting Algorithms
- Bubble Sort (O(n²)) – simple, stable, best for small datasets
- Insertion Sort (O(n²)) – efficient for nearly sorted data
- Merge Sort (O(n log n)) – stable, divide and conquer
- Quick Sort (O(n log n) avg) – fast, in-place sorting

### Searching Algorithms
- Linear Search (O(n)) – works on unsorted data
- Binary Search (O(log n)) – requires sorted data
- Variants: floor, ceiling, insertion point

---

## Problem Breakdown

### Problem 1: Transaction Fee Sorting for Audit Compliance
- Sort transactions using:
  - Bubble Sort (small datasets)
  - Insertion Sort (medium datasets)
- Maintain stability for duplicate fees
- Identify high-fee outliers

**Concepts:**
- Stable sorting
- FIFO fairness simulation
- Real-world audit systems

---

### Problem 2: Client Risk Score Ranking
- Sort client risk scores:
  - Bubble Sort (ascending)
  - Insertion Sort (descending)
- Identify top high-risk clients

**Concepts:**
- In-place sorting
- Ranking systems
- Risk prioritization

---

### Problem 3: Historical Trade Volume Analysis
- Sort large datasets using:
  - Merge Sort (stable)
  - Quick Sort (efficient)
- Merge sorted datasets
- Compute total trade volume

**Concepts:**
- Divide and conquer
- Recursion
- Large-scale data handling

---

### Problem 4: Portfolio Return Sorting
- Sort assets based on returns:
  - Merge Sort (ascending)
  - Quick Sort (descending)
- Handle tie conditions

**Concepts:**
- Financial data modeling
- Hybrid sorting strategies

---

### Problem 5: Account ID Lookup in Transaction Logs
- Implement:
  - Linear Search
  - Binary Search
- Handle duplicates
- Count comparisons

**Concepts:**
- Search optimization
- Time complexity analysis
- Real-world lookup systems

---

### Problem 6: Risk Threshold Binary Lookup
- Perform:
  - Linear search on unsorted data
  - Binary search on sorted data
- Find:
  - Floor value
  - Ceiling value
  - Insertion point

**Concepts:**
- Binary search variants
- Decision boundary problems

---

## Project Structure
<img width="220" height="323" alt="image" src="https://github.com/user-attachments/assets/75fe8053-5be0-4d14-a79d-5b74ada68858" />


---

## How to Run

### Prerequisites
- Java JDK 8 or above
- Any IDE (IntelliJ IDEA, Eclipse, VS Code)

### Compile & Run

```bash
javac Problem1.java
java Problem1
