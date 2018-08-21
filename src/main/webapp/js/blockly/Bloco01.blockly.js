window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco01 = window.blockly.js.blockly.Bloco01 || {};

var x1, x0, x;

/**
 * Bloco01
 */
window.blockly.js.blockly.Bloco01.Executar = function(x, x0, x1) {
	this.cronapi.screen.changeValueOfField('vars.meutext', this.cronapi.screen
			.getValueOfField('params.param1'));
}
