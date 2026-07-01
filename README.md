# Libram

A custom JavaFX touchscreen dashboard for the HYTE Y70 case panel, 
built as a replacement for the stock Nexus software.

![screenshot placeholder](docs/screenshot.png)

## About

Libram is a personal desktop widget dashboard designed to run fullscreen 
on the HYTE Y70's built-in 4K touchscreen. It displays system stats, 
weather, and other at-a-glance widgets in a touch-friendly interface.

Built as a learning project for Java/JavaFX while producing something 
actually useful.

## Built With

- Java 21
- JavaFX 21
- SQLite (via JDBC)
- Maven

## Features

- Fullscreen touch-optimized UI targeting the HYTE Y70 case panel
- Dark themed interface
- Weather widget
- Clock widget
- Persistent widget configuration via SQLite

## Getting Started

### Prerequisites

- Java 21 JDK
- Maven 3.9+

### Running Locally

```bash
git clone https://github.com/taydevgit/libram.git
cd libram
mvn javafx:run
```

## Roadmap

- [ ] Clock widget
- [ ] Weather widget  
- [ ] System stats widget (CPU/GPU)
- [ ] Widget layout persistence
- [ ] Multi-screen targeting

## Version

0.1.0 — Initial scaffold
