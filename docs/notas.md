# Notas de desenvolvimento

- Domínio: tutores, pets, veterinários e agendamento de consultas.

## Regras de agendamento (rascunho)

- Consulta só pode ser marcada em data futura — validado por `Consulta.dataValida()`.
- Retorno é sempre vinculado a uma consulta anterior do mesmo pet.
- Veterinário não pode ter duas consultas no mesmo horário.
