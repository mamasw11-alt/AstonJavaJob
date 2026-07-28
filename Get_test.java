//  Проверка статуса 200
pm.test("Статус ответа 200", function () {
    pm.response.to.have.status(200);
});

//  Проверка тела ответа
pm.test("Тело содержит url и args", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property('url');
    pm.expect(jsonData).to.have.property('args');
});

//  Проверка формата JSON
pm.test("Ответ в формате JSON", function () {
    pm.response.to.have.header("Content-Type", "application/json; charset=utf-8");
});
