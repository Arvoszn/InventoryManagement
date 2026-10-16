# Inventory & Billing OOP Activity (Java)

Four small console programs in one file: product inventory levels, an
electricity bill computation, employee payroll, and hotel room booking. Built as
an Object-Oriented Programming activity to practice inheritance and
polymorphism across several unrelated domains.

## The four exercises

| Demo | Classes | Payoff |
| --- | --- | --- |
| Product inventory | `Product` | Stock status: in stock, low stock, out of stock |
| Electricity bill | `ElectricityBill` | Tiered rate by consumption (residential vs commercial) |
| Employee payroll | `Employee` | Pay computed from hours and role |
| Hotel booking | `Room` → `StandardRoom`, `DeluxeRoom`, `SuiteRoom` | Each room type prices its own nightly rate |

## What it demonstrates

- Subclasses extending a shared base (`Room` → three room types)
- Different rate logic per type rather than a large `if/else` block at the call site
- Consistent `display…Info()` reporting style across unrelated objects
- One `main` that runs every demo in sequence

## Run

```bash
javac -d out oopactivity/*.java
java -cp out com.mycompany.oopactivity.OOPActivity
```

Java 8+. No dependencies.

---

Coursework by **Argelo Nuñez** · [argelo.spawntel.com](https://argelo.spawntel.com) · © 2026, shared for reference — all rights reserved.
