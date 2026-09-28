# Grocery Management System

**CS3354 – Assignment 1: Java Program and Collaboration**
Texas State University

A command-line grocery management system written in Java. It uses **parallel arrays** to store each item's name, price, and stock, where the same index in each array refers to the same item. The user can view the inventory, restock an item, or exit through a text menu.

---

## Team Members & Contributions

| Member | Branch | Task | Method(s) |
|---|---|---|---|
| **Dang Nguyen** | `feature-menu` | Task 3 – User Menu | `main(String[] args)` |
| **Ella Farrell** | `feature-display` | Task 1 – Inventory Display | `printInventory(String[], double[], int[])` |
| **Hunter** | `feature-restock` | Task 2 – Restock & Search | `restockItem(String[], int[], String, int)` |

### Dang Nguyen – User Menu (`feature-menu`)
- Built the menu in `main` with a `Scanner` and a loop.
- Connected the menu to the other methods: **1** = View, **2** = Restock, **3** = Exit.
- Handled invalid menu input and the leftover newline after `nextInt()`.

### Ella Farrell – Inventory Display (`feature-display`)
- Wrote `printInventory`, which loops through the parallel arrays.
- Uses an `if-else` inside the loop so that only non-empty slots (`names[i] != null`) are printed.

### Hunter – Restock & Search (`feature-restock`)
- Wrote `restockItem`, which searches for an item by name with `.equals()`.
- Adds the amount to the matching index in the stock array.
- Prints "Item not found." if the item is not in the inventory.

---

## Project Structure

```
.
├── GroceryManagement.java   # Source code
├── docs/                    # Generated Javadoc documentation
└── README.md
```

---

## How to Run

Requires Java (JDK 8 or later).

```bash
javac GroceryManagement.java
java GroceryManagement
```

### Sample Menu
```
--- Menu ---
1. View
2. Restock
3. Exit
Please enter your choice (1-3):
```

---

## Documentation

Javadoc is generated into the `docs/` folder with:

```bash
javadoc -d docs GroceryManagement.java
```

Open `docs/index.html` in a browser to view it.

---

## Git Workflow

1. Each member created their own feature branch from `main`.
2. Each member completed their task and committed on their branch.
3. Each branch was merged into `main`.

The commit history and branch merges in this repository show each member's individual contributions.
