# Implementación del Comando Undo

## Patrones de Diseño Utilizados

### 1. Patrón Memento
El patrón Memento permite capturar y externalizar el estado interno de un objeto sin violar el encapsulamiento, permitiendo que el objeto pueda ser restaurado a este estado más tarde.

**Componentes:**
- **Originator (ConsoleEditor)**: El objeto cuyo estado necesitamos guardar
- **Memento (DocumentMemento)**: Almacena el estado interno del Originator
- **Caretaker (EditorHistory)**: Responsable de mantener los mementos

### 3. Patrón Command (ya existente)
Encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes. El UndoCommand es una nueva implementación de este patrón.

## Archivos Creados

### DocumentMemento.java
```java
// Captura el estado del documento en un momento específico
// Mantiene una copia inmutable del ArrayList de líneas
```

### EditorHistory.java
```java
// Gestiona el historial de estados usando una pila (Stack)
// Permite push, pop y verificar si está vacío
```

### UndoCommand.java
```java
// Implementa la interfaz Command
// Delega la operación de undo al ConsoleEditor
```

## Archivos Modificados

### ConsoleEditor.java
### CommandFactory.java






