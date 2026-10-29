INSERT INTO todos (id, title, completed, created_at)
VALUES (id, title, completed, created_at)
RETURNING id, title, completed, created_at;