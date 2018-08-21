window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {
	this.cronapi.screen.changeView("#/home/logged/tester", [{
		param0 : this.cronapi.screen.getValueOfField("vars.textrico2")
	}, {
		param1 : this.cronapi.screen.getValueOfField("vars.textRich")
	}, {
		param2 : this.cronapi.screen.getValueOfField("vars.textrico3")
	}]);
}
