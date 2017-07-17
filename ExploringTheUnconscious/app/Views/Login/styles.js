import { StyleSheet } from 'react-native'

const styles = StyleSheet.create({
	container: {
		flex: 1,
		backgroundColor: 'rgba(0,0,0,0)',
	},
	loginStyle: {
		height: 40,
		marginBottom: 25,
		borderWidth: 1,
		borderRadius: 4,
		width: 250,
		marginLeft: 60,
		alignItems: 'center',
		marginTop: 50,
		justifyContent: 'center',
		color: 'black',
	},
	passwordStyle: {
		height: 40,
		borderWidth: 1,
		borderRadius: 4,
		width: 250,
		marginLeft: 60,
		alignItems: 'center',
		justifyContent:'center',
		color: 'black',
		marginBottom: 25,
	},
	button: {
		height: 30,
		borderWidth: 1,
		borderRadius: 3,
		marginLeft: 135,
		width: 100,
	},
	buttonText: {
		fontSize: 20,
		fontFamily: 'Futura-Medium',
		textAlign: 'center',
	},

});


export default styles;
