# Patrones GoF - Grupo 2

En esta carpeta se agregan los patrones usados para complementar las clases electorales del grupo.

## Factory Method

Se usa en `FabricaProceso` para crear procesos electorales de diferentes tipos, como presidencial, legislativo o regional.

## Builder

Se usa en `ActaBuilder` para construir un acta electoral paso a paso, agregando la mesa y los resultados de los candidatos.

## Strategy

Se usa para cambiar la forma de calcular el ganador de un acta. Por ahora existen dos estrategias:

- `ConteoSimple`: gana el candidato con más votos.
- `ConteoPorMayoria`: gana solo si supera la mitad de los votos.

## Facade

Se usa en `FachadaSistemaElectoral` para centralizar operaciones básicas como registrar procesos, candidatos, partidos y territorios.

## Singleton

El patrón Singleton ya se encuentra aplicado en `SistemaElectoral`, porque maneja una única instancia del sistema mediante `getInstancia()`.
