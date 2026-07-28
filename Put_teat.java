pm.test("Статус ответа 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Тело содержит url и data", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData).to.have.property('url');
    pm.expect(jsonData).to.have.property('data');
});

pm.test("Ответ в формате JSON", function () {
    pm.response.to.have.header("Content-Type", "application/json; charset=utf-8");
});

pm.test("Данные совпадают", function () {
    const jsonData = pm.response.json();
    pm.expect(jsonData.data).to.eql({
        "name": "Test",
        "id": 123
    });
});
