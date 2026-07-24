# clinica-vet

Sistema de gestão para clínica veterinária — repositório de exercícios guiados
do curso de backend Java/Spring.

Domínio: tutores, pets, veterinários e agendamento de consultas.

## Status

Em desenvolvimento — **Módulo 1 (fundamentos de Git)**. Sem código executável ainda.

## Tecnologias

- Java 21
- Spring Boot _(módulos futuros)_
- Maven
- MySQL + Spring Data JPA _(módulos futuros)_

## Como rodar

Ainda não aplicável — projeto em fase de fundamentos.

## Estrutura

```
src/
  main/java/     # código fonte
docs/            # anotações e decisões de design
```

## Modelo de domínio

### `Consulta`

| Campo | Tipo | Descrição |
|---|---|---|
| `pet` | `String` | nome do pet atendido |
| `tutor` | `String` | nome do tutor responsável |
| `data` | `LocalDate` | dia do agendamento |
| `motivo` | `String` | queixa ou procedimento |

`dataValida()` rejeita agendamento com data no passado — hoje é permitido.
