pm.test("Статус ответа 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Тело содержит url", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property('url');
});

pm.test("Ответ в формате JSON", function () {
    pm.response.to.have.header("Content-Type", "application/json; charset=utf-8");
});
